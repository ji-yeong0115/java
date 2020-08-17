package com.kh.collection.list.part2.model.service;

import java.util.ArrayList;
import java.util.List;

import com.kh.collection.list.part2.model.vo.Student;

public class PracticeService {
	
	private List<Student> list = new ArrayList<Student>();
	// Student ��ü(��ü ���� ����)�� ������ �� �ִ�
	// ArrayList�� �Ҵ� �޾� �� �ּҸ�  list�� ����
	// + ArrayList ���� �� �⺻�����ڸ� ����ϸ� �⺻ 10ĭ�� �Ҵ�ȴ�.
	
	public boolean addStudent(Student std) {
		return list.add(std);
		
	}
	
	public List<Student> selectAllStudent() { 
		return list;
		// �θ�Ÿ���� ���������� �ڽ�Ÿ���� ����
	}
	
	
	public Student removeStudent(int index) { 

		Student std = null; // �����Ǵ� �л��� ������ ������ ����
		
		// 1) ���޹��� index�� ���� �迭�� ���� ���� �ִ� ���ΰ�?
		if(index >= 0 && index < list.size()) {
			
			// 2) ���� �� �л� ������ ��ȭ -> ���� ���� ������ ������ ����
			// + ���� �� ����ֱ�
			std = list.remove(index);
		}
		
		return std;
	}
}

