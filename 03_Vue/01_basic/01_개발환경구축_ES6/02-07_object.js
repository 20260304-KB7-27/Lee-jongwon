//객체 구조분해할당
const user = {
  name: 'Alice',
  age: 25,
  job: 'Developer',
  info: {
    address: 'Seoul',
    hobbies: ['reading', 'coding'],
  },
};

// //객체 속성명을 다르게 사용하고 싶다면 별칭을 지정할 수 있다.
// const { age: ageNo, name: userName } = user;

// console.log(ageNo);
// console.log(userName);

//중첩된 객체 구조분해
const {
  name,
  age,
  info: {
    address,
    hobbies: [firstHobby, secondHobby],
  },
} = user;

console.log(address);
console.log(firstHobby);
console.log(secondHobby);
