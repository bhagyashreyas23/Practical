def myrange(*num):
    start = 0
    stop = 0
    step = 1
    if len(num)==1:
        stop=num[0]
    elif len(num)==2:
        start,stop = num
    elif len(num)==3:
        start,stop,step = num
    elif len(num)>3:
        raise Exception("Required 3", len(num),"Given")
    
    while(start<stop):
        print(start)
        start += 1

myrange(1,10,2)
