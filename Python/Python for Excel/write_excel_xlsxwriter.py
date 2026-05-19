import datetime as dt
import xlsxwriter
import excel

# Instantiate a workbook          
book = xlsxwriter.Workbook("xlxswriter.xlsx")          

# Add a sheet and give it a name          
sheet = book.add_worksheet("Sheet1")       

# Writing individual cells using A1 notation          
# and cell indices (0-based)          
sheet.write("A1", "Hello 1")
sheet.write(1, 0, "Hello 2")          

# Formatting: fill color, alignment, border and font 
formatting = book.add_format({"font_color": "#FF0000",                                        
                              "bg_color": "#FFFF00",                                        
                              "bold": True, "align": "center",                                        
                              "border": 1, "border_color": "#FF0000"})
sheet.write("A3", "Hello 3", formatting)   

# Number formatting (using Excel's formatting strings)          
number_format = book.add_format({"num_format": "0.00"})
sheet.write("A4", 3.3333, number_format)         

# Date formatting (using Excel's formatting strings)          
date_format = book.add_format({"num_format": "mm/dd/yy"})
sheet.write("A5", dt.datetime(2016, 10, 13), date_format)

# Formula: you must use the English name of the formula          
# with commas as delimiters          
sheet.write("A6", "=SUM(A4, 2)")      

# Image          
sheet.insert_image(0, 2, "images/python.png")        

# Two-dimensional list (we're using our excel module)          
data = [[None, "North", "South"],                  
        ["Last Year", 2, 5],                  
        ["This Year", 3, 6]]          
excel.write(sheet, data, "A10")          

# Chart: see the file "sales_report_xlsxwriter.py" in the          
# companion repo to see how you can work with indices          
# instead of cell addresses          
chart = book.add_chart({"type": "column"})          
chart.set_title({"name": "Sales per Region"})         
chart.add_series({"name": "=Sheet1!A11",                           
                   "categories": "=Sheet1!B10:C10",                            
                   "values": "=Sheet1!B11:C11"})          
chart.add_series({"name": "=Sheet1!A12",                            
                  "categories": "=Sheet1!B10:C10",                            
                  "values": "=Sheet1!B12:C12"})          
chart.set_x_axis({"name": "Regions"})          
chart.set_y_axis({"name": "Sales"})          
sheet.insert_chart("A15", chart)

# Closing the workbook creates the file on disk        
book.close()