$(document).ready(function(){
    loadData(0);
});

function loadData(page) {
    $("#data2 > tbody").empty();

    $.getJSON('/products' + page, function(data2) {
        var i;

        for (i = 0; i < data2.length; i++) {
            $('#data2 > tbody:last-child').append(
                $('<tr>')
                    /*.append(
                        $('<td>').append(
                            $('<input>').attr('type', 'checkbox').attr('value', data[i].id)
                        )
                    )*/
                    /*.append($('<td>').append(data2[i].date.replace('T', '  ')))
                    .append($('<td>').append(data2[i].text))*/
                    /*.append($('<td>').append(data[i].name))
                    .append($('<td>').append(data[i].brendId))*/
                    .append($('<td>').append(data2[i].brendId))
            );
        }
    });
}
