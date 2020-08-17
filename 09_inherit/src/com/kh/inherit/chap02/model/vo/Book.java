package com.kh.inherit.chap02.model.vo;

public class Book extends Object {
	//extends Object ���ۼ� �� JVM�� ���� ������ �ܰ迡�� �ڵ� �߰�
	
	// Object Ŭ������ �ڹ� Ŭ������ �� �ֻ��� �θ� Ŭ����
	// --> ��� Ŭ������ Object�� �ļ� Ŭ����
	
	
	// �ʵ�
	private String title;
	private  String author;
	private int price;
	
	// �⺻ ������
	public Book() {
		
	}
	
	// �Ű����� �ִ� ������
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
// ----------------------------------------------
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
// ----------------------------------------------
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	// ��� �ʵ� ������ ��ȯ
//	public String selectField() {
		
//	}
	
	
	/* @Override ������̼�
	 * - ������̼�(Annotation) : �����Ϸ����� Ư�� �ڵ峪 ��Ȳ�� �˷��ִ� ����
	 * - @Override : �����Ϸ����� �ش� ���� �޼ҵ尡 �ڽĿ� ���ؼ� �������̵�(������)
	 *               �Ǿ��ٴ� ���� �˷���
	 *   + ���ſ��� @Override ǥ�ð� �ʼ� ������ ����� ��� ����
	 *     ��� �����ڵ� ���� �ڵ� ���� �� �������� ���Ͽ� ���� �ۼ��ϴ°� ����
	 */
	
	
	
	@Override
	public String toString() { // vo �ʼ�
		// Object.toString() �뵵
		// ������ ��ü�� �ʵ� ������ ��� ����ϴ� �޼ҵ带 ���� ������ ���� �̸� �������̵� �ؼ� ����ϵ���
		// �ڹٿ��� �����ϴ� �޼ҵ�
		
		return title + " / " + author + " / " + price;
		
	}
	
	// hashCode();
	// ���� ��ü �˻� + �˻� �ӵ� ���
	// HashSet, HashMap, HashTable ��� ���
	@Override
	public int hashCode() {
		
		// �ߺ����� �ʴ� hashCode�� ����µ� �� 31�� ����ϴ°�?
		// --> 31�� Ȧ���̸鼭 ������ ū �Ҽ��̰�, ��Ʈ ������ ������ ������ ����� �� �ִ� �� �̰�,
		//		�� ���� ���� ��������� hashCode�� �浹�� ���� ��� ���������� ���ǰ� ����
		final int prime = 31; 
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + price;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (price != other.price)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	// Object.equals() �������̵� --> ��ü�� �������� �Ǻ�
	// �������̵� �� equals() : �� ��ü�� �����ּҰ� �������� �Ǻ�
	// �������̵� �� equals() : ��ü�� ������ �ִ� �ʵ� ���� ������ �Ǻ�

	
/*	
 	@Override
	public boolean equals(Object obj) {
		
		// 1. ��ü�� ���� �ּҰ� ������ �� : �����ּҰ� ���� == true(���� ��ü)
		if(this == obj) {
			return true;
		}
		
		// 2. ���޹��� �ּҰ� null(�����ϴ� ���� ����)���� �Ǻ�
		// ���޹��� �ּҰ� null�� ��� �� ��ġ�� ���� -> ������ false
		if(obj == null) {
			return false;
		}
		
		// Ŭ���� �� ��ȯ
		// obj�� Object�� �����ϴ� ���������� �̸� Book�� �����ϴ� ������ ����ȯ
		Book other = (Book)obj; // ������	
		
		// 3. �� ��ü ���� �ʵ� �� ��
		// ���� ��
		if(this.title != null && other.title != null) {
			// �� Book ��ü�� ��� title�� ���� �ܿ�
			if(!this.title.equals(other.title)) {
				// title�� ���� �ʴٸ� �ٸ� �� --> false
				return false;	
			}
		}else { // �� �� �ϳ� �Ǵ� �� �� null�� ���� �ٸ� �� --> false
			return false;
		}
		
		// ���� ��
		if(this.author != null && this.author != null) {
			if(!this.author.equals(other.author)) {
				return false;
			}
		}else {
			return false;
		}
		
		// ���� ��
		if(this.price != other.price) {
			// price�� �⺻ �ڷ����̱� ������ �ּ� �񱳰� �ʿ� ����, �� ��ü�� ���ϸ� �ȴ�.
			return false;	
		}
		
		// ������� �ڵ� ���� --> �ʵ尪�� ��� ����  == ���� ��ü�̴�.
		return true;
		
		// ���� : ���� �ٸ� ��ü���� ���� ����
		// ���� : ���� ���� ��ü
	}
*/
	
	public String informationTransfer() { // ���� ����
		return "���ο� �ۼ��� ������ �д� ������� �����Ѵ�.";
	}

}
