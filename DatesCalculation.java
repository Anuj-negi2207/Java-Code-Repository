//By - 19BAI10021, Anuj Singh Negi

class Date
{
	int day, month, year;

	Date(int d, int m, int y)
	{
		this.day = d;
		this.month = m;
		this.year = y;
	}

	void Add(Date D)
	{
		int d_total, m_total, y_total;

		d_total = this.day + D.day;
		m_total = this.month + D.month;
		y_total = this.year + D.year;


		int x = 32;

		while(x>0)
		{
			
			if(m_total>12)
			{
				x = m_total / 12;
				m_total = m_total % 12;

				y_total += 1;
			} 

			if(m_total == 2)
			{
				if(d_total>28)
				{
					d_total = d_total % 28;
					m_total += 1;
					x = d_total/28;
				}
			}

			else if (m_total == 4 || m_total == 6 || m_total == 9 || m_total == 11) 
			{
				if(d_total>30)
				{
					d_total = d_total % 30;
					m_total += 1;
					x = d_total/30;
				}
			}

			else
			{	
				if(d_total>30)
				{
					d_total = d_total % 31;
					m_total += 1;
					x = d_total/31;
				}
			}

		}


		
		System.out.print("Addition of dates (dd/mm/yyyy) - ");
		System.out.println(d_total + "/" + m_total + "/" + y_total);
	}


	void Substraction(Date D)
	{
		int d_total, m_total, y_total;

		d_total = this.day - D.day;
		m_total = this.month - D.month;
		y_total = this.year - D.year;

		if(this.year<D.year)
		{
			d_total *= (-1);
			m_total *= (-1);
			y_total *= (-1);

		}

		if(this.month<D.month)
		{
			m_total *= (-1);
			m_total -= this.month;	
		}

		if(this.month>D.month)
		{
			m_total -= this.month;
		}

		if(this.day<D.day)
		{
			d_total = this.day + d_total;
		}

		System.out.print("Substraction of dates (dd/mm/yyyy) - ");
		System.out.println(d_total + "/" + m_total + "/" + y_total);
	}

}

class DatesCalculation
{
	public static void main(String[] args) 
	{
		Date d1 = new Date(31, 12, 1999);
		Date d2 = new Date(28, 2, 2002);

		Date d3 = new Date(16, 10, 2014);
		Date d4 = new Date(24, 11, 2050);

		d2.Add(d1);	 //Should print 3/3/4002
		d4.Add(d3);

		d2.Substraction(d1);	//Should print 25/8/3
		d4.Substraction(d3);
	}
	
}
