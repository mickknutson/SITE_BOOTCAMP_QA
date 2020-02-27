let create_ul = document.getElementById('cr');
let read_ul = document.getElementById('re');
let update_ul = document.getElementById('up');
let delete_ul = document.getElementById('del');

let li = document.createElement('li');

///// CREATE

// method 1
li.innerText = 'hello boy';
// method 2
// list_item.appendChild(document.createTextNode('this is the create element'));
create_ul.appendChild(li);

///// READ

console.log(read_ul.innerText);
console.log(read_ul.innerHTML);

///// UPDATE
update_ul.innerHTML = '<li>Hello girl</li>';


///// DELETE
//todo

function hello() {

    alert('hello Master')
    
}
