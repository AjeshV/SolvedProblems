def isDiagonalMatrix(matrix):
    n = len(matrix)
    for i in range(0,n): 
        for j in range(0,n): 
            if ((i != j)  and (matrix[i][j] != 0)):
                return False   
    return True
