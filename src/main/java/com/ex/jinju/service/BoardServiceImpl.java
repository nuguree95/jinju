
package com.ex.jinju.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ex.jinju.dto.BoardDTO;
import com.ex.jinju.mapper.BoardMapper;
@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	BoardMapper boardMapper;

	@Override
	public int addBoard(BoardDTO dto) {
		return boardMapper.addBoard(dto);
		
		
	}	

}
