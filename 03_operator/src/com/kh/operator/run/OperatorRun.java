package com.kh.operator.run;
import com.kh.operator.service.A_LogicalNegation;
import com.kh.operator.service.B_InDecrement;
import com.kh.operator.service.C_Arithmetic;
import com.kh.operator.service.D_Comparison;
import com.kh.operator.service.E_Logic;
import com.kh.operator.service.F_Compound;
import com.kh.operator.service.G_Triple;

public class OperatorRun {
	
	public static void main(String[] args) {
		
		// �� ���� ������
		A_LogicalNegation ln = new A_LogicalNegation();
		//ln.example1();
		
		// ���� ������
		B_InDecrement id = new B_InDecrement();
		//id.example1();
		//id.example2();
		//id.example3();
		
		// ��� ������
		C_Arithmetic at = new C_Arithmetic();
		//at.example1();
		
		// �� ������
		D_Comparison comp = new D_Comparison();
		//comp.example1();
		
		//�� ������
		E_Logic lo = new E_Logic();
		//lo.example1();
		//lo.example2();
		//lo.example3();
		//lo.example4();
		
		// ���� ���� ������
		F_Compound co = new F_Compound();
		//co.example1();
		
		// ���� ������
		G_Triple tri = new G_Triple();
		//tri.example1();
		tri.example2();
		
	}

}
