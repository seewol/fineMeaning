package com.fin.proj.board.model.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import com.fin.proj.board.model.vo.Board;
import com.fin.proj.board.model.vo.Reply;
import com.fin.proj.common.model.vo.PageInfo;

@Mapper
public interface BoardDAO {

	int getListCount(String i);

	ArrayList<Board> selectBoardList(String i, RowBounds rowbounds);

	int countUp(int bNo);

	Board selectBoard(int bNo);

	ArrayList<Reply> selectReply(int bNo);

	int insertBoard(Board b);

	void insertReply(Reply r);

	int updateBoard(Board b);

	int deleteBoard(int bId);

	int insertFruit(Board b);

	int deleteReply(int replyNo);

	int deleteReplyAll(int boardNo);

	int replyCount(int boardNo);

	ArrayList<Board> searchByTitle(HashMap<String, Object> map, RowBounds rowbounds);
	
	ArrayList<Board> searchByTitleAndCategory(HashMap<String, Object> params, RowBounds rowbounds);

	int searchListCount(HashMap<String, Object> params);

	ArrayList<Reply> selectReply(int bNo, RowBounds rowbounds);

}
