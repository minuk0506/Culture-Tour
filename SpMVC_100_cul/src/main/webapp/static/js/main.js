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
  const join = document.querySelector(".join");
  const login = document.querySelector(".login");
  const logout = document.querySelector(".logout");
  const mypage = document.querySelector(".mypage");
  const userSession = '<%=(String)session.getAttribute("USER")%>';
  let url = `${rootPath}`;

  hambtn.addEventListener("click", () => {
    console.log("menu clicked");
    if (slidemenu.classList.contains("clicked")) {
      slidemenu.classList.remove("clicked");
    } else {
      slidemenu.classList.add("clicked");
    }
  });

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

    if (div.innerText === "?????? ??????") {
      url += "travel/tour";
    } else if (div.innerText === "????????? ????????????") {
      url += "active/event";
    } else if (div.innerText === "????????? ??????") {
      url += "travel/facility";
    } else if (div.innerText === "????????? ????????????") {
      url += "/map";
    } else if (div.innerText === "???????????? ??????") {
      url += "/calendar";
    }

    document.location.href = url;
  };

  // querySelectAll ??? ????????? ????????? ????????? li tag ??????
  // ?????? event ????????????
  for (const div of divs) {
    div.addEventListener("click", divs_click);
  }
});
