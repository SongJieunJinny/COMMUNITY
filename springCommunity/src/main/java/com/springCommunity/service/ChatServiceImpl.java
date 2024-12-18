package com.springCommunity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springCommunity.dao.ChatDAO;
import com.springCommunity.vo.*;

@Service
public class ChatServiceImpl implements ChatService {

	@Autowired
	private ChatDAO chatDAO;
	
	@Override
	public List<ChatVO> selectAll(SearchVO searchVO) {
		return chatDAO.selectAll(searchVO);
	}

	@Override
	public List<UserInfoVO> searchUsers(SearchVO searchVO) {
		return chatDAO.searchUsers(searchVO);
	}

	@Override
	public int insertRoom(ChatVO chatVO) {
		return chatDAO.insertRoom(chatVO);
	}
	
	@Override
	public int addChatUser(int chat_no, String user_id, String chatName) {
		ChatVO chatVO = new ChatVO();
        chatVO.setChat_no(chat_no);
        chatVO.setUser_id(user_id);
        chatVO.setChat_users_name(chatName);
		return chatDAO.addChatUser(chatVO);
	}

	@Override
	public List<UserInfoVO> chatUsers(int chat_no) {
		return chatDAO.chatUsers(chat_no);
	}

	@Override
	public int leaveChatRoom(ChatVO chatVO) {
		return chatDAO.leaveChatRoom(chatVO);
	}
	
	@Override
	public int sendMessage(ChatMessageVO chatMessageVO) {
		return chatDAO.sendMessage(chatMessageVO);
	}
	
	@Override
	public int sendMessageAfterFirst(ChatMessageVO chatMessageVO) {
		return chatDAO.sendMessageAfterFirst(chatMessageVO);
	}
	
	@Override
	public int sendMessageAfterSecond(ChatMessageVO chatMessageVO) {
		return chatDAO.sendMessageAfterSecond(chatMessageVO);
	}

	@Override
	public List<ChatMessageVO> loadMessage(int chat_no) {
		return chatDAO.loadMessage(chat_no);
	}
	
	@Override
	public int updateReadState(ChatVO chatVO) {
		return chatDAO.updateReadState(chatVO);
	}

	@Override
	public int updateChatName(ChatVO vo) {
		return chatDAO.updateChatName(vo);
	}

	@Override
	public int updateChatUserName(ChatVO vo) {
		return chatDAO.updateChatUserName(vo);
	}

	@Override
	public int chatStateCount(ChatVO chatVO) {
		return chatDAO.chatStateCount(chatVO);
	}

	@Override
	public List<ChatVO> chatInfo(int chat_no) {
		return chatDAO.chatInfo(chat_no);
	}

	@Override
	public int updateChatState(ChatVO chatVO) {
		return chatDAO.updateChatState(chatVO);
	}

	@Override
	public int sendSystemMessage(ChatVO chatVO) {
		return chatDAO.sendSystemMessage(chatVO);
	}

	@Override
	public int updateChatGroup(ChatVO chatVO) {
		return chatDAO.updateChatGroup(chatVO);
	}

	@Override
	public int updateChatOne(int chat_no) {
		return chatDAO.updateChatOne(chat_no);
	}

	@Override
	public ChatVO chatName(ChatVO vo) {
		return chatDAO.chatName(vo);
	}

	@Override
	public int updateChatTop(int chat_no) {
		return chatDAO.updateChatTop(chat_no);
	}
}
