$(document).ready(function () {

  /**
   * トップに戻す
   */
  $('#to_top').click(function () {

    // Element取得
    var $page = $('html,body');
    // 位置取得
    var distance = $('html').scrollTop() + $('body').scrollTop();
    // 時間
    var time = 500;
    // 間隔
    var intervalTime = 10;
    // 回数小計
    var times = time / intervalTime
    // 実行１回距離
    var itemDistane = distance / times;

    alert("original distance" + distance);

    // jQuery提供の関数setInterval,clearInterval
    // setInterval（function, milliseconds）方法將繼續調用該函數，
    // 直到調用clearInterval（）或關閉窗口為止 。
    var intervalId = setInterval(function () {
      distance = distance - itemDistane;
      if (distance <= 0) {
        distance = 0;
        console.log("distance" + distance);
        clearInterval(intervalId);
      }
      // $('html,body').scrollTop(distance);
      $page.scrollTop(distance);
    }, intervalTime);
  });

});