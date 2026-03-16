// 배열 구조분해 할당

const animals = ['bear', 'tiger', 'giraffe', 'elephant', 'lion'];

//1. 기본적인 배열 구조분해할당
const [ani1, ani2, ani3] = animals;
// console.log(ani1, ani2, ani3);

//2. 나머지 요소 가져오기
const [first, ...rest] = animals;

// console.log(first); //첫번째 요소
// console.log(rest); //나머지 요소

//3. 기본값 설정
const zoo = ['panda', 'koala'];

const [animals1, animals2, animals3 = 'monkey', animals4 = 'rabbit'] = zoo;
console.log(animals1, animals2, animals3, animals4);

//4. 중첩된 배열
const arr = [1, [2, 3], 4];

const [num1, [num3, num4], num2] = arr;

console.log(num1, num3, num4, num2);
