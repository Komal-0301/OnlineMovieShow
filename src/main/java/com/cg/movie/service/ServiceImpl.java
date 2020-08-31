package com.cg.movie.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cg.movie.dao.IShowDao;
import com.cg.movie.entity.Show;
import com.cg.movie.exceptions.ShowException;
import com.cg.movie.util.ShowConstants;

@Service

public class ServiceImpl implements ShowService{
	@Autowired
	private IShowDao showDao;


	@Override
		public List<Show> displayShow(String show) throws ShowException {
			List<Show> showList = showDao.displayShow(show);
			if (showList.isEmpty())
				throw new ShowException(ShowConstants.SHOW_NOT_AVAILABLE);
			//showList = showList.stream().filter(s->s.getShowName()==ShowConstants.DISPLAY_SHOW_URL).collect(Collectors.toList());
			//showList.sort((s1,s2)->s2.getShowDate().compareTo(s1.getShowDate()));
			return showList;
		}

	}