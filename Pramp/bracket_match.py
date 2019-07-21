def bracket_match(text):
  a = []
  for c in text:
    if not a: a.append(c)
    elif a[-1] == '(' and c == ')': del a[-1]
    else: a.append(c)
  return len(a)
