package org.company;

public class CompanyInfo {
private void companyName(String name) {
System.out.println("company name is:"+name);

}
private void companyName(int members) {
System.out.println("total working staff:"+members);
}
public static void main(String[] args) {
	{
		CompanyInfo c=new CompanyInfo();
		c.companyName(100000000);
		c.companyName("tata consultancy services");
	}
}
}