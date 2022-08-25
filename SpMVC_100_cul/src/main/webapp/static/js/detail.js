document.addEventListener("DOMContentLoaded", () => {
  const update = document.querySelector(".update");
  const lists_body = document.querySelector("div.student.detail_body");
  const back_to_list = document.querySelector("back_to_list");
  update?.addEventListener("click", (e) => {
    const st_num = lists_body.dataset.st_num;
    document.location.href = `${rootPath}/student/detail?st_num=${st_num}/update`;
  });

  back_to_list?.addEventListener("click", (e) => {
    const btn = e.target;
    btn.document.location.href = `${rootPath}/student/`;
  });
});
