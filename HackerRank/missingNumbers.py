def missingNumbers(arr, brr):
    return sorted((Counter(brr) - Counter(arr)).keys())
