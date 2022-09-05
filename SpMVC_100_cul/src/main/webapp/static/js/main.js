document.addEventListener("DOMContentLoaded", () => {
  const divs = document.querySelectorAll("div div.top-menu");
  const hambtn = document.querySelector(".ham-btn");
  const slidemenu = document.querySelector("div.slide-menu");
  let url = `${rootPath}`;

  hambtn.addEventListener("click", () => {
    console.log("menu clicked");
    if (slidemenu.classList.contains("clicked")) {
      slidemenu.classList.remove("clicked");
    } else {
      slidemenu.classList.add("clicked");
    }
  });

  const divs_click = (e) => {
    const div = e.target;

    if (div.innerText === "광주 여행") {
      url += "travel/tour";
    } else if (div.innerText === "광주의 즐길거리") {
      url += "active/event";
    } else if (div.innerText === "다양한 시설") {
      url += "travel/facility";
    } else if (div.innerText === "지도로 찾아보기") {
      url += "/map";
    } else if (div.innerText === "캘린더로 찾기") {
      url += "/calendar";
    }

    document.location.href = url;
  };

  // querySelectAll 을 통해서 배열로 가져온 li tag 들에
  // 공통 event 설정하기
  for (const div of divs) {
    div.addEventListener("click", divs_click);
  }
});
