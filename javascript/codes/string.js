var s="It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief."
var q=s.replace(/times/g,"period")
console.log(q)
var w=s.replace(/it/g,"IT")
console.log(w)
console.log(s.length)
var a=s.split(" ")
console.log(a)
console.log(s.indexOf("s"))
console.log(s.lastIndexOf("b"))
console.log(s.toUpperCase())
console.log(s.toLowerCase())
//numbers
function numbers(min,max){
 
    var num = Math.random() *(max-min)+min;
   
    console.log(Math.round(num));
  }
   
  numbers(1,7);
  numbers(2,9);
  

