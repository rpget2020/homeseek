package com.mvc.homeseek.model.biz;

import java.util.List;
import java.util.Map;

import com.mvc.homeseek.model.dto.MessageDto;

public interface MessageBiz {

	// 쪽지 보내기
	public int insertMessage(MessageDto messagedto);

	// 받은 쪽지 다중삭제
	public int muldelMyReMsgList(int message_no);

	// 보낸 쪽지 다중삭제
	public int muldelMySenMsgList(int message_no);

	// 보낸 쪽지함 list
	public List<MessageDto> selectMySenMsgList(String message_senid);
	
	// 보낸 쪽지함의 totalCount
	public int countMsgBySenid(String message_senid); 
	
	//보낸 쪽지함의 리스트
	public List<MessageDto> MsgBySenid(Map<String, Object> map);
	// 보낸 쪽지함의 totalCount
	public int countMsgByReid(String message_reid); 
	
	//보낸 쪽지함의 리스트
	public List<MessageDto> MsgByReid(Map<String, Object> map);
	
	// 받은 쪽지함 list
	public List<MessageDto> selectMyReMsgList(String message_reid);

	// 받은 쪽지 상세보기
	public MessageDto selectMyMsgDetail(int message_no);
}
