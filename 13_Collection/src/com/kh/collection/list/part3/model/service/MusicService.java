package com.kh.collection.list.part3.model.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.collection.list.part3.model.sort.ArtistDesc;
import com.kh.collection.list.part3.model.sort.TitleAsc;
import com.kh.collection.list.part3.model.sort.TitleDesc;
import com.kh.collection.list.part3.model.vo.Music;

public class MusicService {
	
	// À½¾Ç ¸ñ·Ï ÀúÀå¿ë List ¼±¾ğ ¹× »ı¼º
	private List<Music> list = new ArrayList<Music>();
	
	/**
	 * list¿¡ Àü´Ş¹ŞÀº À½¾ÇÀ» Ãß°¡ÇÏ´Â service
	 * @param m
	 * @return true
	 */
	public boolean addMusic(Music m) {
		return list.add(m);
		
	}
	
	
	/**
	 * À½¾ÇÀÌ ÀúÀåµÇ¾î ÀÖ´Â list¸¦ ¹İÈ¯ÇÏ´Â service
	 * @return list
	 */
	public List<Music> selectAllMusic(){
		return list;
	}
	
	/**
	 * Àü´Ş¹ŞÀº Å°¿öµå¸¦ Á¦¸ñÀ¸·Î °¡Áö°í ÀÖ´Â À½¾Ç°Ë»ö service
	 * @param keyword
	 * @return serchList (°Ë»öµÈ ¸ğµç À½¾Ç (0°³ ÀÌ»ó))
	 */
	public List<Music> searchMusic(String keyword){
		
		// °Ë»öµÈ À½¾ÇÀ» ÀúÀåÇÒ list¸¦ ¼±¼º ¹× »ı¼º
		List<Music> searchList = new ArrayList<>();
		
		// Á¦¸ñ °Ë»ö ±â´É
		for(Music m : list) {
			if(m.getTitle().contains(keyword)) {
				// ÇöÀç Á¢±ÙÇÑ Music °´Ã¼(m)ÀÇ Á¦¸ñ Áß
				// Àü´Ş¹ŞÀº keyword°¡ Æ÷ÇÔµÇ¾î ÀÖ´Ù¸é if¹® ½ÇÇà
				// --> ÇØ´ç °´Ã¼¸¦ serahList¿¡ Ãß°¡
				searchList.add(m);
			}
		}
		
		return searchList;
	}
	
	/**
	 * Àü´Ş¹ŞÀº Á¦¸ñ°ú ÀÏÄ¡ÇÏ¯H Á¦¸ñÀ» °¡Áø À½¾ÇÀ» »èÁ¦ÇÏ´Â service
	 * @param title
	 * @return m
	 */
	public Music removeMusic(String title) {
		
		// »èÁ¦µÉ À½¾Ç °´Ã¼¸¦ ÀÓ½Ã ÀúÀå(ÂüÁ¶)ÇÒ º¯¼ö ¼±¾ğ
		Music m = null;
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				// ÇöÀç Á¢±ÙÇÑ Music °´Ã¼ÀÇ Á¦¸ñÀÌ Àü´Ş¹ŞÀº title°ú °°´Ù¸é if ½ÇÇà
				m = list.remove(i);
				// list¿¡¼­ i¹øÂ° ÀÎµ¦½º ¿ä¼Ò¸¦ Á¦°ÅÇÏ¸é¼­
				// ¤¸[°ÅÇÑ ¿ä¼Ò¸¦ ¹İÈ¯ÇÏ¿© m¿¡ ÀúÀå
			}
		}
		return m;
		
	}
	
	/**
	 * Àü´Ş ¹ŞÀº title°ú °°Àº Á¦¸ñÀ» °¡Áø À½¾ÇÀ» ¸ñ·Ï¿¡¼­ °Ë»öÇÏ¿©
	 * ÇØ´çÀ½¾ÇÀ» Àü´Ş¹ŞÀº mÀ¸·Î ¼öÁ¤ÇÏ´Â service
	 * @param title
	 * @param m
	 * @return 1(¼öÁ¤ ¼º°ø) / -1(¼öÁ¤ ½ÇÆØ)
	 */
	public int updateMusic(String title, Music m) {
		
		Music old = null;
		// ¼öÁ¤µÈ ÀÌÀü Music °´Ã¼¸¦ ÂüÁ¶ÇÒ ÀÓ½Ã º¯¼ö ¼±¾ğ
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				old = list.set(i, m);
				// list i¹øÂ° ÀÎµ¦½º¿¡ Àü´Ş¹ŞÀº Music °´Ã¼ mÀ» ÀúÀåÇÏ°í
				// ¼öÁ¤ Àü °´Ã¼¸¦ old¿¡ ÀúÀå
				break;
			}
		}
		
		// old°¡ ÂüÁ¶ÇÏ´Â °ªÀÌ ÀÖÀ¸¸é --> ¼öÁ¤ ¼º°ø
		if(old != null) {
			return 1;
		}else {
			return -1;
		}
	}
	
	/**
	 * Àü´Ş¹ŞÀº ¸ŞÁê ¹øÈ£¿¡ µû¶ó Á¤·ÄµÇ list¸¦ ¹İÈ¯ÇÏ´Â service
	 * @param sel
	 * @return list
	 */
	public List<Music> sortMusic(int sel){
		
		switch(sel) {
		case 1: // °¡¼ö¸í ¿À¸§Â÷¼ø --> MusicÀÇ ±âº» Á¤·Ä
			Collections.sort(list); break;
		case 2: // °¡¼ö¸í ³»¸²Â÷¼ø --> º°µµÀÇ Á¤·Ä ¹æ¹ı
			Collections.sort(list, new ArtistDesc()); break;
		case 3: // Á¦¸ñ ¿À¸§Â÷¼ø --> º°µµÀÇ Á¤·Ä ¹æ¹ı
			Collections.sort(list, new TitleAsc()); break;
		case 4: // Á¦¸ñ ³»¸²Â÷¼ø --> º°µµÀÇ Á¤·Ä ¹æ¹ı
			Collections.sort(list, new TitleDesc()); break;
		}
		return list;
	}

}
