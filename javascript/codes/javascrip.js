
document.getElementById("h1").innerHTML = "Welcome yo my site";
document.getElementById("p1").innerHTML = "My name is priya";
 
var h2Element = document.getElementById("h2");
document.getElementById("main").removeChild(h2Element);
 
document.getElementById("p2").style.color="blue";
document.getElementById("p2").innerHTML = "I Love JavaScript";

document.getElementById('b1').addEventListener('btn',clicked)
function clicked(){
    
    document.getElementById('p1').innerHTML = 'button 1 clicked';
    console.log('button 1 is clicked');
    alert('button is pressed');
}