var restaurantMenu={
    name: "Spicy Kitchen",
    menu:[
      {
foodName: "Fried Rice",
      foodPrice:200
    },
    {
      foodName:"Noodles",
      foodPrice:150
    },
    {
      foodName:"Pasta",
      foodPrice:300
    },
{
  foodName:"Pizza",
  foodPrice:250
},
{
  foodName:"Roll",
  foodPrice:100
}
],
menuDisplay:function(){
var menuList;
for(var i=0;i<=4;i++){
  menuList = i+" "+this.menu[i].foodName + " "+this.menu[i].foodPrice;
  console.log(menuList);
}
},
selectMenuItem: function(number){
console.log(this.menu[number]);
}
}


restaurantMenu.menuDisplay();
restaurantMenu.selectMenuItem(2);
restaurantMenu.selectMenuItem(3);