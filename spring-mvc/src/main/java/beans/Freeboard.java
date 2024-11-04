package beans;

// 자유 게시판 bean
public class Freeboard {
	private String id;
	private String writer;
	private String title;
	private String content;
	
	public Freeboard() {
	}
	
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
