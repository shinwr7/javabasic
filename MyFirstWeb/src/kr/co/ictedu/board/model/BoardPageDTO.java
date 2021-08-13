package kr.co.ictedu.board.model;

import java.util.List;

public class BoardPageDTO {
	private int total;
	private int currentPage;
	private List<BoardVO> boardList;
	private int startPage;
	private int endPage;
	private int totalPages;
	
	// 전체 글 개수, 현재 페이지, 페이징된 글 목록을 받아서 
	// 나머지 정보를 얻어냅니다.
	
	public BoardPageDTO(int total,
						int currentPage,
						List<BoardVO> boardList) {
		this.total = total;
		this.currentPage = currentPage;
		this.boardList = boardList;
	
	//아래부터 위 3개를 토대로 가공해서 나머지 변수를 채웁니다.
	// 글이 없는 경우 페이지및 버튼 자체가 필요없음
	if(total == 0) {
		this.totalPages = 0;
		this.startPage =0;
		this.endPage = 0;
	} else {
		// 게시글 총 개수를 이용해 전체 페이지 개수부터 구하기
		this.totalPages = total/10;
		if(this.total % 10 >0) {
			// 만약 나눴을때 10개로 딱떨어지지 않으면
			// 마지막에 페이지를 하나 더 추가해야함
			this.totalPages +=1; 
			
			
			
			
			
			

			
			
		}
		
		// 현재 보고 있는 페이지 그룹의 시작 번호 구하기
		int modVal= this.currentPage%10;
		this.startPage = this.currentPage / 10*10 + 1;
		if(modVal == 0) {
			this.startPage -=10;
		}
		
		// 해당 페이지 그룹의 끝 번호 구하기
		endPage = startPage + (10-1);
		// 단 위에서 구한 명목상의 마지막 번호가
		// totalPages를 초과하는 경우는
		// totalPages로 대신 대입한ㄷ.
		if(endPage > totalPages) {
			endPage = totalPages;
		}
	}
	} //end constructor 
	
	
	public int getTotal() {
		return total; // 총 글 개수 리턴
		
	}
	
	public boolean hasNoBoard() {
		return total == 0;
	}
	
	public boolean hasboard() {
		return total > 0;
	}
	
	public int getTotalPages() {
		return totalPages; 
	}
	
	public List<BoardVO> getBoardList() {
		return boardList; // 해당 페이지에 표기할 글 목록 리턴
	}
	
	public int getStartPage() {
		return startPage; // 해당 페이지 그룹의 시작번호 리턴
	}
	
	public int getEndPage() {
		return endPage; // 해당 페이지 그룹의 끝번호 리턴
	}


	@Override
	public String toString() {
		return "BoardPageDTO [total=" + total + ", currentPage=" + currentPage + ", boardList=" + boardList
				+ ", startPage=" + startPage + ", endPage=" + endPage + ", totalPages=" + totalPages + "]";
	}
	
	
	}

	
	
	

