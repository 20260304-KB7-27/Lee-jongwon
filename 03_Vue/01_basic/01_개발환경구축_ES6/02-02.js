let msg = 'GLOBAL'; // 전역 스코프

function outer() {
  let msg = 'OUTER'; // 함수 스코프(지역)
  console.log(msg); //OUTER
  if (true) {
    let msg = 'BLOCK';
    console.log(msg); // BLOCK
  }
}

outer();

console.log(msg); // GLOBAL
