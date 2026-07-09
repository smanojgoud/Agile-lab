basic =float(input("Enter Basic Salary"))
  hra=0.20*basic
  da=0.10*basic

  total_salary=basic + hra + da
  tax=0.05*total_salary
  net_salary=total_salary-tax
  print("Basic Salary:",basic)
  print("HRA:",hra)
  print("DA:",da)
  print("Total_salary:",total_salary)
  print("Tax:",tax)
  print("Net_Salary:",net_salary)
