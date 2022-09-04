document.addEventListener("DOMContentLoaded", () => {
  const searchBar = document.querySelector("#search");
  const searchUrl = `${rootPath}`;
  searchBar.addEventListener("keypress", (e) => {
    const search = e.target.value;
    console.log("data 함수정보", search);
    if (e.keyCode === 13) {
      console.log("keypress 먹힘");
      document.location.href = searchUrl + "search?search=" + search;
      // const searchData = (search) => {
      //   fetch(`searchUrl/search?search=${search}`)
      //     .then((res) => res.text())
      //     .catch((err) => {
      //       console.log(err);
      //     });
      // };
    }
  });
});
