//VAR
//global scope
var number = 50

function print() {
  var square = number * number
  console.log(square)
}

console.log(number) // 50

print() // 2500

//inside function

function print() {
    var number = 50
    var square = number * number
    console.log(square)
  }
  
  print() // 2500
  
  console.log(number)
  // ReferenceError: number is not defined

  //redeclare

  var number = 50
console.log(number) // 50

var number = 100
console.log(number) // 100
//reassign

number= 60
console.log(number) // 60
//have to hosited on top of global or local scope
//inbetween hosited it will say undefined/NaN
function print() {
    var square1 = number * number
    console.log(square1)
  
    var number = 50
    print() //NaN

    //LET-can declare in global,local,block scope

    
    let number = 50

function print() {
  let square = number * number

  if (number < 60) {
    var largerNumber = 80
    let anotherLargerNumber = 100

    console.log(square)
  }

  console.log(largerNumber)
  console.log(anotherLargerNumber)
}

print()/*access number everywhere,.access square in the function because they have local scope. But accessing anotherLargerNumber outside the block throws an anotherLargerNumber is not defined error.*/
// 2500
// 80
// ReferenceError: anotherLargerNumber is not defined

//reassign is possible but we cannot redeclare
let number = 50
console.log(number) // 50

number = 100
console.log(number) // 100

let number = 100
// SyntaxError: Identifier 'number' has already been declared
// So when you try to access such variables, instead of getting undefined, or variable is not defined error, you get cannot access variable before initialization
console.log(number)
// ReferenceError: Cannot access 'number' before initialization

let number = 50
//CONST- have to initialize with value when declared.
//Variables declared with const are similar to let in regards to scope.

const number = 50

function print() {
  const square = number * number

  if (number < 60) {
    var largerNumber = 80
    const anotherLargerNumber = 100

    console.log(square)
  }

  console.log(largerNumber)
  console.log(anotherLargerNumber)
}

print()
// 2500
// 80
// ReferenceError: anotherLargerNumber is not defined// as of let
//cant redeclare and reassign
const number = 50

const number = 100

// SyntaxError: Identifier 'number' has already been declared
number = 100
// TypeError: Assignment to constant variable