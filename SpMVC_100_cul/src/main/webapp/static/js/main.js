document.addEventListener("DOMContentLoaded", () => {
  const divs = document.querySelectorAll("div div.top-menu");
  const hambtn = document.querySelector(".ham-btn");
  const slidemenu = document.querySelector(".slide-menu");
  const eventHref = document.querySelector(".eventHref");
  const festivalHref = document.querySelector(".festivalHref");
  const msmartglrHref = document.querySelector(".msmartglrHref");
  const tourHref = document.querySelector(".tourHref");
  const ruinsHref = document.querySelector(".ruinsHref");
  const home = document.querySelector(".logo");
  const rightBtn = document.querySelector(".right-btn");
  const join = document.querySelector(".join");
  const login = document.querySelector(".login");
  const logout = document.querySelector(".logout");
  const mypage = document.querySelector(".mypage");
  let url = `${rootPath}`;
  const userSession = '<%=(String)session.getAttribute("USER")%>';
  hambtn.addEventListener("click", () => {
    console.log("menu clicked");
    if (slidemenu.classList.contains("clicked")) {
      slidemenu.classList.remove("clicked");
    } else {
      slidemenu.classList.add("clicked");
    }
  });
  rightBtn.addEventListener("click", () => {
    if (userSession == null) {
      logout.classList.add("invisible");
      mypage.classList.add("invisible");

      join.classList.remove("invisible");
      login.classList.remove("invisible");
    } else if (userSession != null) {
      join.classList.add("invisible");
      login.classList.add("invisible");

      logout.classList.remove("invisible");
      mypage.classList.remove("invisible");
    }
  });

  eventHref.addEventListener("click", () => {
    document.location.href = url += "active/event";
  });
  festivalHref.addEventListener("click", () => {
    document.location.href = url += "active/event";
  });
  msmartglrHref.addEventListener("click", () => {
    document.location.href = url += "travel/facility";
  });
  tourHref.addEventListener("click", () => {
    document.location.href = url += "travel/tour";
  });
  ruinsHref.addEventListener("click", () => {
    document.location.href = url += "travel/tour";
  });
  home.addEventListener("click", () => {
    document.location.href = `${rootPath}`;
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
