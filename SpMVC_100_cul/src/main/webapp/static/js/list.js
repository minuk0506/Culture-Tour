document.addEventListener("DOMContentLoaded", () => {
  const lists_body = document.querySelector("tbody.student.body");
  lists_body?.addEventListener("click", (e) => {
    const td = e.target;
    const tr = td.closest("TR");
    const st_num = tr.dataset.stnum;
    document.location.href = `${rootPath}/student/detail?st_num=${st_num}`;
  });
});
