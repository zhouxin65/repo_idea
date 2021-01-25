package com.lagou.controller;

import com.lagou.domain.Course;
import com.lagou.domain.CourseSection;
import com.lagou.domain.ResponseResult;
import com.lagou.service.CourseContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/courseContent")
public class CourseContentController {

    @Autowired
    private CourseContentService contentService;

    @RequestMapping("/findSectionAndLesson")
    public ResponseResult findSectionAndLessonByCourseId(Integer courseId) {

        // 调用service
        List<CourseSection> list = contentService.findSectionAndLessonByCourseId(courseId);

        ResponseResult responseResult = new ResponseResult(true, 200, "章节&课时内容查询成功", list);

        return responseResult;

    }

    /**
     * 回显章节对应的课程信息
     */
    @RequestMapping("/findCourseByCourseId")
    public ResponseResult findCourseByCourseId(Integer courseId) {

        Course course = contentService.findCourseByCourseId(courseId);

        ResponseResult responseResult = new ResponseResult(true, 200, "查询课程信息成功", course);

        return responseResult;

    }

    /**
     * 新增&更新章节信息
     */
    @RequestMapping("/saveOrUpdateSection")
    public ResponseResult saveOrUpdateSection(@RequestBody CourseSection courseSection) {

        // 判断是否携带了章节Id
        if (null == courseSection.getId()) {

            // 新增
            contentService.saveSection(courseSection);
            return new ResponseResult(true, 200, "新增章节成功", null);

        } else {

            // 更新
            contentService.updateSection(courseSection);
            return new ResponseResult(true, 200, "更新章节成功", null);

        }

    }

    /**
     * 修改章节状态
     */
    @RequestMapping("/updateSectionStatus")
    public ResponseResult updateSectionStatus ( int id, int status){

        contentService.updateSectionStatus(id,status);

        // 数据响应
        HashMap<String, Object> map = new HashMap<>();
        map.put("status",status);

        return new ResponseResult(true,200,"修改章节状态成功",map);

    }

}
