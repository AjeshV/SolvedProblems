def oddNumbers(l, r):
    a = []
    while l <= r:
        if l%2==1: a.append(l)
        l+=1
    return a
