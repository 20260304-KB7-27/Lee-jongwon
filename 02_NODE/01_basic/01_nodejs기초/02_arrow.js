// var getTriangle = function (base, height) {
//   return (base * height) / 2;
// };
// console.log('삼각형의 면적:' + getTriangle(5, 2));

// 화살표함수

let getTriangle = (base, height) => {
  (base * height) / 2;
  // 추가 코드 작성
};
console.log('삼각형의 면적: ' + getTriangle(5, 2));

//
const person = {
  name: 'bear',

  //일반함수
  hello1: function () {
    console.log(`일반함수 : `, this);
  },

  //화살표함수
  hello2: () => {
    console.log(`화살표함수 : `, this);
  },
};

person.hello1();
person.hello2();
