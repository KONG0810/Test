$(document).ready(function () {
  console.log (1111);
  const delUrl = "/employee/delete";
  const addUrl = "/employee/add";
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

  function getID() {
    $(".delete").click(function () {
      let eId = $(e.target).attr("name");
      console.log (eId);
      return eId;
    });
  };

  function del(url, id) {
    $.ajax({
      url: url,
      type: 'post',
      data: {
        eId: id
      },
      dataType: 'json',
      contentType:"application/json;charset=utf-8",
      success: function (xhr, status) {
        console.log(xhr);
        //alert(JSON.stringify(xhr));
      },
      error: function (xhr, status) {
        console.log(status);
        console.log(xhr);
      }
    });
  };



});