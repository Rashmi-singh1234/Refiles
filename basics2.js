const flag=true

if(!flag){
    console.log("condition satisfied")
}
else{
    console.log("condition not satisfied")
}
let markss=Array(6)
//marks=new Array(20,40,35,12,37,100)

var s=[20,45,6,7,7,9]
console.log(s[2])
s[3]=14
console.log(s)
s.push(5)
console.log(s)
s.unshift(7)
console.log(s)
console.log(s.includes(120))
var sum=0
for(let i=0;i<s.length;i++){
    sum=sum+s[i]
}
console.log(sum);
let d=s.reduce((sum,totalMarks)=>sum+totalMarks,0)
console.log(d)
var abcd=[34,56,78,98]
var abc=[]
for(let i=0;i<abc.length;i++){
    if(abcd[i]%2==0){
       abc.push(abcd[i])
    }
}
console.log(abc)
let anothermethod=abc.filter(abcd=>abcd%2==0)
console.log(anothermethod)