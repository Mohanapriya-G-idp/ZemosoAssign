// Here is a bunch of Lorem Ipsum. You will need it. I recomend using word wrap to view this! View > Toggle Word Wrap
const lorem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi dictum lorem vel elit laoreet, vitae maximus ligula consectetur. Etiam magna quam, varius at risus eu, rutrum commodo lacus. Maecenas felis sem, consequat non congue non, vestibulum vitae orci. Etiam laoreet ultricies enim, sit amet gravida massa sodales vel. Vivamus tempus neque sed mi elementum ornare eget non lorem. Donec dapibus ex tortor, ut vehicula metus scelerisque eget. Aenean dictum iaculis nulla, vel dapibus justo dignissim quis. Curabitur vitae efficitur neque. Ut vitae orci semper, efficitur dolor eget, porta dui. Cras eu sapien aliquam mauris facilisis ullamcorper. Nullam facilisis sem diam, quis tempor felis interdum ut. Praesent eu nibh arcu. Proin a quam augue. Integer malesuada finibus sem eget consectetur. Aenean non hendrerit purus, quis auctor elit. Duis ullamcorper, ex vitae rutrum ullamcorper, diam justo maximus quam, eget pellentesque metus nunc sit amet arcu. Nunc id eros leo. Praesent ultricies, nunc sit amet finibus posuere, quam magna viverra lectus, non tincidunt tellus mauris sit amet turpis. Nam eleifend quam vel justo pulvinar euismod. Duis ac elit id risus ultricies sollicitudin vitae ac quam. Donec et cursus leo, non dignissim enim. Vestibulum in felis imperdiet, venenatis tortor iaculis, congue augue. Nullam egestas dui nec quam sagittis sollicitudin ac blandit turpis. Nunc in fermentum odio. Morbi sodales mi nibh, ac cursus felis ultricies sed. Quisque at porttitor risus. Aenean a massa in libero venenatis tempus sed in mi. Nullam luctus sapien eget sagittis egestas. Pellentesque eros sem, semper eu molestie in, commodo a lacus. Phasellus pellentesque erat magna, eu facilisis nibh porttitor eget. Ut id mi lobortis, consequat orci ac, vulputate metus. Sed vulputate turpis nec lectus malesuada lacinia. Quisque non mattis eros. Aliquam pellentesque urna vulputate, auctor nibh in, fermentum odio. Suspendisse aliquam neque et aliquam facilisis. Donec sapien felis, molestie vel vestibulum non, sagittis sed felis. Aenean sodales iaculis dolor eget malesuada. Fusce ac libero hendrerit, viverra nunc iaculis, maximus nisi. Nulla volutpat nisi purus, non interdum erat hendrerit vitae. Integer viverra dignissim cursus. Phasellus eu libero sed ex faucibus convallis. In et egestas ipsum. Cras a metus mollis, laoreet risus eget, ultrices purus. Duis at ligula venenatis, imperdiet nulla et, bibendum augue. Pellentesque eleifend libero maximus, pretium lectus et, condimentum metus. Nulla vel est diam. In fermentum ut nulla eget finibus. Aliquam at turpis sagittis, feugiat diam ac, pulvinar quam. Phasellus pretium porta aliquet. Nunc sit amet nisl viverra justo porttitor egestas vel vitae eros. Fusce sit amet fringilla sapien. Nunc placerat, est sit amet laoreet pretium, augue turpis lacinia ipsum, non luctus magna ipsum vel sapien. Fusce luctus odio eget nunc rutrum ullamcorper. Integer vel ligula id elit viverra aliquam. Praesent id ultricies neque. Quisque molestie tellus ac ex vulputate rhoncus. Donec nec massa eget augue tincidunt ultrices vitae at diam. Ut risus purus, egestas eu eros sed, egestas auctor erat. Integer vulputate erat nisi, in aliquet turpis faucibus vel. Praesent neque augue, congue at nunc ut, congue ultricies erat. Ut sed erat in dui ornare malesuada. Nam id elementum ex. Vestibulum condimentum erat quis erat molestie hendrerit. Etiam laoreet volutpat quam, eget ornare ex molestie mollis. Phasellus eros mi, ultrices vel dui ac, facilisis consectetur nunc. Aliquam erat volutpat. Donec rutrum laoreet iaculis."


// Add a list of colors to this array
const colors = ["red","green","brown","yellow","orange","white","blue"]


// Use this object for your random name generator. Enter in a bunch of objects with first and last names. When generating a new random name, try to grab a random first or last name from any object. Don't just take object as a whole.
const names =
[
    {
        firstName: "Veni",
        lastName: "Mohan"
    },
    {
        firstName: "Priya",
        lastName: "Krishnan"
    } ,
    {
        firstName: "Mohan",
        lastName: "Gopal"
    }, 
    {
        firstName: "Divya",
        lastName: "Atharva"
    },
    {
        firstName: "Meera",
        lastName: "Samy"
    },
     {
        firstName: "Aadhiv",
        lastName: "Ganesh"
    }
]
//random number generator
ranGenerator=(min,max) => {
    let random = Math.floor(Math.random()*(max-min +1)+min)
return random
}
//Returns a random number between 1-100
returnRandomNum=()=>{
    let rand=ranGenerator(1,100)
    document.getElementById("p1").innerHTML=rand
}
//Returns a random number between "Start" and "End"
numberBetween=()=>{

    let start=document.getElementById("rand1").value
    let end=document.getElementById("rand2").value
    
    if(Number(start)<Number(end)){
       
    let number=ranGenerator(start,end)
    document.getElementById("p2").innerHTML=number
    }else{
        
        document.getElementById("p2").innerHTML=`end value is lesser than start value`
    }
    
}
//Returns a long Lorem Ipsum String


loremString=()=>{

    return document.getElementById("p3").innerHTML= lorem
}
//Returns a Lorem Ipsum String based on the number of sentences
const sentence=()=>{

    let noOfSentence=lorem.split(".")
    let loremSentence=document.getElementById("sentences").value
    let stringCount=""
    if( Number.isInteger(Number(loremSentence))){
    for(let i=0;i<loremSentence;i++){
        stringCount=stringCount+noOfSentence[i]
            }     
   document.getElementById("p4").innerHTML=stringCount

    }else{
        document.getElementById("p4").innerHTML="error value entered"  
    }}

 
//Returns a Lorem Ipsum String based on the number of characters
charCount=()=>{

    let noOfChar=lorem.split("")
    let loremChar=document.getElementById("charcters").value
    let charCount=""
    for(let i=0;i<loremChar;i++){
        charCount=charCount+noOfChar[i]
    }
 document.getElementById("p5").innerHTML=charCount
}
//Returns the current date


const myDate=()=>{
    let newDate= new Date()
    let year=newDate.getFullYear()
let mont=newDate.getMonth()+1
let day=newDate.getDate()
if(mont<10){
    mont="0"+mont
}
if(day<10){
    day="0"+day
}
let newFormat= day+" - "+mont+" - "+year
document.getElementById("p6").innerHTML= newFormat
}
//Returns the current time


myTime=()=>{
    let newTim= new Date()
    let hour=newTim.getHours()
    let min=newTim.getMinutes()
    let apm
    if(hour>=12){
        hour=hour-12
        apm="PM"
    }else{
        apm="AM"
    }
    if(min<10){
        min="0"+min
    }
    let newTime=hour+": "+min+ " "+apm
    document.getElementById("p7").innerHTML=newTime
}
//Converts Inches to Feet
const convertToFt=()=>{
let inch=document.getElementById("inch").value
let toFeet=inch/12+ " ft"
document.getElementById("p8").innerHTML=toFeet
}

//Converts Feet to Inches
convertToInch=()=>{
let feet=document.getElementById("feet").value
let toInch=feet*12 + " inch"
document.getElementById("p9").innerHTML=toInch
}

//Compares if two words are the same length
compareTwoWords=()=>{
let fristWord=document.getElementById("first").value
let secondWord=document.getElementById("second").value
let compare=""
if(fristWord.length==secondWord.length){
    compare="Both words have same length"
}else{

    compare=`Both words have different length :first word length : ${fristWord.length}  second word length : ${secondWord.length}`
}
document.getElementById("p10").innerHTML= compare
}
//random password

randomPass=()=>{
    let chars=["a","b","c","d","e","f","g","h","i","j","k","l","0","9","8","7","6","5","%","$","#","@","&"]
let pass=""
for (let i = 0; i < 10; i++) {
    const element = ranGenerator(0,chars.length-1)
    pass=pass+chars[element]
    
}
document.getElementById("p11").innerHTML=pass
}//even or odd
evenOdd=()=>{
    let num=document.getElementById("number").value
    let number=""
    if(num%2==0){
        number=num+" is even number"
    }else{
        number= num+" is odd number"
    }
document.getElementById("p12").innerHTML=number
}
//random colour
randomColor=()=>{
let color=""
    color=colors[ranGenerator(0,colors.length)]
    document.getElementById("p13").innerHTML=color
}
//random first and last name
randomName=()=>{
    let firstNam=names[ranGenerator(0,names.length-1)].firstName
    let lastNam=names[ranGenerator(0,names.length-1)].lastName
    let fullNam=firstNam+" "+lastNam
document.getElementById("p14").innerHTML=fullNam
}