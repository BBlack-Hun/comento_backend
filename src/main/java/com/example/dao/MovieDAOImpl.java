package com.example.dao;

import com.example.vo.MovieVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import java.util.List;

@Repository
public class MovieDAOImpl implements MovieDAO{

    @Inject
    private SqlSession sqlSession;
    private static final String Namespace = "com.example.database.test";

    @Override
    public List<MovieVO> selectMovie() throws Exception {
        return sqlSession.selectList(Namespace+".selectMovie");
    }
}
