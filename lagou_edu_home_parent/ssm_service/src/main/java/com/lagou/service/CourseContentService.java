package com.lagou.service;

import com.lagou.domain.Course;
import com.lagou.domain.CourseSection;

import java.util.List;

public interface CourseContentService {

    /**
     * 根据课程Id查询对应的课程内容（章节 + 课时）
     *
     * @param courseId
     * @return
     */
    List<CourseSection> findSectionAndLessonByCourseId(Integer courseId);

    /**
     * 回显章节对应的课程信息
     *
     * @param courseId
     * @return
     */
    Course findCourseByCourseId(Integer courseId);

    /**
     * 新增章节信息
     */
    void saveSection(CourseSection courseSection);

    /**
     * 更新章节信息
     *
     * @param courseSection
     */
    void updateSection(CourseSection courseSection);

    /**
     * 修改章节状态
     */
    void updateSectionStatus(int id, int status);
}
