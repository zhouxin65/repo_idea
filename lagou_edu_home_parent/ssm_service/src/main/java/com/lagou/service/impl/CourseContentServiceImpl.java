package com.lagou.service.impl;

import com.lagou.dao.CourseContentMapper;
import com.lagou.domain.Course;
import com.lagou.domain.CourseSection;
import com.lagou.service.CourseContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CourseContentServiceImpl implements CourseContentService {

    @Autowired
    private CourseContentMapper courseContentMapper;

    @Override
    public List<CourseSection> findSectionAndLessonByCourseId(Integer courseId) {

        List<CourseSection> list = courseContentMapper.findSectionAndLessonByCourseId(courseId);
        return list;

    }

    @Override
    public Course findCourseByCourseId(Integer courseId) {

        Course course = courseContentMapper.findCourseByCourseId(courseId);
        return course;

    }

    @Override
    public void saveSection(CourseSection courseSection) {

        // 补全信息
        Date date = new Date();
        courseSection.setCreateTime(date);
        courseSection.setUpdateTime(date);

        // 调用courseContentMapper方法
        courseContentMapper.saveSection(courseSection);

    }

    @Override
    public void updateSection(CourseSection courseSection) {

        // 补全信息
        Date date = new Date();
        courseSection.setUpdateTime(date);

        // 调用courseContentMapper方法
        courseContentMapper.updateSection(courseSection);

    }

    @Override
    public void updateSectionStatus(int id, int status) {

        // 封装数据
        CourseSection courseSection = new CourseSection();
        courseSection.setId(id);
        courseSection.setStatus(status);
        courseSection.setUpdateTime(new Date());

        // 调用courseContentMapper方法
        courseContentMapper.updateSectionStatus(courseSection);

    }
}
