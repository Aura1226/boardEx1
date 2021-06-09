package org.donghyun.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.donghyun.board.domain.Board;
import org.donghyun.board.dto.BoardDTO;

public interface BoardMapper {
	
	public List<Board> getList(@Param("skip") int skip ,
							   @Param("perSheet") int perSheet,
							   @Param("arr")String[] type,
							   @Param("keyword") String keyword);
	
	public int getTotalCount(@Param("arr") String[] type,
							 @Param("keyword") String keyword);
	
	public Board selectOne(@Param("bno") Integer bno);
	
	public void insert(Board board);
	
	public void delete(Integer bno);
	
	public void update(Board board);
	
}
