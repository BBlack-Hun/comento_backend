package com.example.settingweb;

import com.example.service.MovieService;
import com.example.vo.MovieVO;
import org.slf4j.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.inject.Inject;
import java.util.List;
import java.util.Locale;

@Controller
@RequestMapping("/")
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Inject
    private MovieService service;

    @GetMapping
    public String home(Locale locale, Model model) throws Exception{

        logger.info("home");

        List<MovieVO> movieList = service.selectMovie();

        model.addAttribute("movieList", movieList);

        return "index";
    }
}
