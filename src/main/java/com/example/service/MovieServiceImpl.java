package com.example.service;

import com.example.dao.MovieDAO;
import com.example.vo.MovieVO;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Inject
    private MovieDAO dao;

    public List<MovieVO> selectMovie() throws Exception {
        return dao.selectMovie();
    }
}
