#!/usr/bin/perl

use DBI;
use strict;

my $driver   = "SQLite"; 
my $database = "customer.db";
my $dsn = "DBI:$driver:$database";
my $userid = "";
my $password = "";
my $dbh = DBI->connect($dsn, $userid, $password, { RaiseError => 1 }) 
   or die $DBI::errstr;

print "Opened database successfully\n";


my $stmt = qq(SELECT first_name, last_name, home from customer;);
my $sth = $dbh->prepare( $stmt );
my $rv = $sth->execute() or die $DBI::errstr;

if($rv < 0) {
   print $DBI::errstr;
}

while(my @row = $sth->fetchrow_array()) {
      print "first_name = ". $row[0] . "\n";
      print "last_name= ". $row[1] ."\n";
      print "home = ". $row[2] ."\n";
}
print "Operation done successfully\n";
$dbh->disconnect();