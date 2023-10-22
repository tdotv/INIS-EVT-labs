const personalMovieDB = {
    privat : Boolean,
    movies : {}    
};

personalMovieDB.movies = {"oppenheimer" : 10, "barbie" : 0, "seven" : 10};

function showTable(){
    let k = '<tbody>';
    for(let prop in personalMovieDB.movies){
        k+= '<tr>';
        k+= '<td>' + prop + '</td>';
        k+= '<td>' + personalMovieDB.movies[prop] + '</td>';
        k+= '</tr>';
    }
    k+='</tbody>';
    document.getElementById('tableData').innerHTML = k;
}

showTable();