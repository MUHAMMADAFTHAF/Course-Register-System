function showCourses(){
    fetch("http://localhost:8080/courses")
    .then((response) => response.json())
    .then((courses) => {
        const dataTable = document.getElementById("courseTable")

        courses.forEach(course =>{
            var row = `<tr>
            <td>${course.courseId }</td>
             <td>${course.courseName }</td>  
             <td>${course.trainer }</td>
             <td>${course.durationInWeeks }</td>
            </tr>`

            dataTable.innerHTML+=row;
        })
    })
}


function showEnrolled(){
    fetch("http://localhost:8080/courses/enrolled")
    .then((response) => response.json())
    .then((student) => {
        const dataTable = document.getElementById("enrollTable")

        student.forEach(student =>{
            var row = `<tr>
            <td>${student.name }</td>
             <td>${student.emailId }</td>  
             <td>${student.courseName }</td>
            </tr>`

            dataTable.innerHTML+=row;
        })
    })
}
