alert("hello world!")
prompt("what is youe name?")
//variables
var car
var carType="sedan"
var carWheel=4
var isThisCar=true
car="Alto"
//maths

var num1=10
var num2=5
var num=num1+num2
num=num1-8
var num4=num/2
var num5=num1%2
var num6=num2*6
var string = "1"
string + 1
//condtion statements
var ans=prompt("what is your fav.colour?")
var ans1=prompt("what is your fav.food")
if(ans=="red"&& ans1=="dosa");{
    console.log("option 1")
}
    elseif(ans=="blue"|| ans1=="sambar");{
        console.log("option 2")
    }elseif(ans=="yellow");{
        console.log("option 3")
    }

    if(ans=="red"){
        if(ans1="dosa"){
            console.log("option 1")
        }
        else{
            console.log("option 2")
        }
    }
    //arrays

    var q=[1,2,"name",true]

    q.pop()//remove last element in array
    q.push("red")//add element at last
    q.shift()//remove 1st element in a array
    q.unshift("world")//add element as 1st element in a array
    q.splice(0,0,"cat")// add element in front
    q.splice(0,1)// remove 1element
     var w=q.slice(2)//create a new array and store the element specified.

//loops

var a=prompt("type y or n")
var b=["y","n"]
for(var i=0;i<3;i++){
    if(a==b[0]){
        console.log("its yes")
    }
    else{
        console.log("its no")
    }
}
while(a==b[1]){
    console.log("its no")
}
do{
    console.log("cant define")
}while(a==b[2])


switch(a){
    case b[0]:
        console.log("its yes")
        case b[1]:
            console.log("its no")
            case b[2]:
                console.log("cant determine")
}
//area of triangle

var n = 5;
var string = "";
for (var i = 1; i <= n; i++) {
for (var j = 0; j < i; j++) {
    string += "*";
    }
    string += "\n";
     } 
    console.log(string);

const r=function(){
    console.log("its a function")
}
r()
//declare a function
function e(){
    console.log("e is function")
}
e()
// it wil return some date written inside it
function t(){
    return 5

}
console.log(t())

//parameters and arguments
function n(mes1,mes2){//parameters
    console.log(mes1)
    console.log(mes2)
}
n(1,"value")//arguements



var answer = prompt("Enter the amount you are paying");

function calculate(cost){
var price = 5;
return cost-price;
}

if(calculate(answer) === 0){
console.log("You have entered the correct amount")
} else if(calculate(answer) > 0){
console.log("You gave too much. Your change due is "+ calculate(answer));
}else if(calculate(answer)<0){
console.log("You gave too little. You still owe.." + calculate(answer));
}