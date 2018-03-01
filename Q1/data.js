
// Creating a new list item when clicking on the "Add" button
function insert(container) {
    var rows =


    [ { first_name : 'Srinadh', last_name : 'Reddy', home : 'Earth' },
        { first_name : 'Zoe', last_name : 'Heriot', home : 'Space Station W3'},
        { first_name : 'Jo', last_name : 'Grant', home : 'Earth'},
        { first_name : 'Leela', last_name : null, home : 'Unspecified'},
        { first_name : 'Romana', last_name : null, home : 'Gallifrey'},
        { first_name : 'Clara', last_name : 'Oswald', home : 'Earth'},
        { first_name : 'Adric', last_name : null, home : 'Alzarius'},
        { first_name : 'Susan', last_name : 'Foreman', home : 'Gallifrey'} ];

    var content = '<table class="table ">';
    content += '<thead>';
    content += '<tr>';
    for( var j in rows[0] ) {
        content += '<th scope="row">' + j + '</th>';
    }
    content += '</thead>';
    content += '<tbody>';
    content += '</tr>';
    for( var i = 0; i < rows.length; i++) {
        content += '<tr>';
        for( var j in rows[i] ) {
            content += '<td>' + rows[i][j] + '</td>';
        }
    }
    content += '</tbody>';
    content += '</table>';
    document.getElementById(container).innerHTML = content;
}