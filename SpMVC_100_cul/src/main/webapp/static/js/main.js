document.addEventListener("DOMContentLoaded", () => {
  const divs = document.querySelectorAll("div div.top-menu");
  const hambtn = document.querySelector("nav li span.material-icons");
  const slidemenu = document.querySelector("div.slide-menu");
  const search = document.querySelector("form input");
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
    }

    document.location.href = url;
  };
  if (search) {
    search.addEventListener("keypress", async (e) => {
      if (e.keyCode === 13) {
        console.log("keypress 먹힘");
        url += "search/search";
      }
      document.location.href = url;
      search.addEventListener("click", e.target);
    });
  }
  // querySelectAll 을 통해서 배열로 가져온 li tag 들에
  // 공통 event 설정하기
  for (const div of divs) {
    div.addEventListener("click", divs_click);
  }
});
