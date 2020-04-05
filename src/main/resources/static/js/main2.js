$(document).ready(function(){
    loadData(0);
});

function loadData(page) {
    $("#data > tbody").empty();

    $.getJSON('/tasks?page=' + page, function(data) {
        var i;

        for (i = 0; i < data.length; i++) {
            $('#data > tbody:last-child').append(
                $('<tr>')
                    .append(
                        $('<td>').append(
                            $('<input>').attr('type', 'checkbox').attr('value', data[i].id)
                        )
                    )
                    .append($('<td>').append(data[i].date.replace('T', '  ')))
                    .append($('<td>').append(data[i].text))
                    .append($('<td>').append(data[i].text2))
                    .append($('<td>').append(data[i].date.replace('T', '  ')))
            );
        }
    });
}
