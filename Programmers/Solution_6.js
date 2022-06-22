// 문제 : 같은 숫자는 싫어
// 결과 : 성공
// Score : 정확성 71.9 효율성 28.1
function solution(arr) {
  return check_arr(arr, arr.length);
}

function check_arr(arr, len) {
  var target;
  var item;
  var result = [];
  for (var i = 0; i < len; i++) {
    item = arr[i];
    if (item != target) {
      result.push(item);
    }
    target = item;
  }

  return result;
}
